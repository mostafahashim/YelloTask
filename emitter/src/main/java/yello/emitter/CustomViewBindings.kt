package yello.emitter

import android.graphics.drawable.Drawable
import android.os.Build
import android.text.Html
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions
import yello.emitter.util.Preferences
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.RoundedCornersTransformation


class CustomViewBindings {
    companion object {
        @BindingAdapter("htmlText")
        @JvmStatic
        fun setHtmlTextValue(textView: TextView, htmlText: String?) {
            if (htmlText == null) return
            val result = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Html.fromHtml(htmlText, Html.FROM_HTML_MODE_LEGACY)
            } else {
                Html.fromHtml(htmlText)
            }
            textView.text = result
        }

        @BindingAdapter("adapter")
        @JvmStatic
        fun bindRecyclerViewAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<*>) {
            recyclerView.adapter = adapter
        }

        @BindingAdapter("imageUrlSquare")
        @JvmStatic
        fun loadImageUrlSquare(imageView: ImageView, imageUrl: String?) {
            var imageUrlVar = imageUrl
            if (imageUrlVar == null)
                imageUrlVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlVar)

                Glide.with(imageView).load(imageUrlVar)
                    .apply(
                        RequestOptions().placeholder(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                            .error(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                            .diskCacheStrategy(
                                DiskCacheStrategy.ALL
                            )
                    )
                    .into(imageView)
            }
        }


        @BindingAdapter("imageUrlRect")
        @JvmStatic
        fun loadImageUrlRect(imageView: ImageView, imageUrl: String?) {
            var imageUrlVar = imageUrl
            if (imageUrlVar == null)
                imageUrlVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlVar)

                Glide.with(imageView).load(imageUrlVar)
                    .apply(
                        RequestOptions().placeholder(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                            .error(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                            .diskCacheStrategy(
                                DiskCacheStrategy.ALL
                            )
                    )
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlBlurRect")
        @JvmStatic
        fun loadImageUrlBlurRect(imageView: ImageView, imageUrl: String?) {
            var imageUrlVar = imageUrl
            if (imageUrlVar == null)
                imageUrlVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlVar)

                Glide.with(imageView).load(imageUrlVar)
                    .apply(
                        RequestOptions
                            .bitmapTransform(BlurTransformation(25, 5))
//                                .placeholder(R.drawable.mcu_background)
//                                .error(R.drawable.mcu_background)
//                                .diskCacheStrategy(
//                                    DiskCacheStrategy.ALL
//                                )
                    )
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlBlurRectResource")
        @JvmStatic
        fun loadImageUrlBlurRectResource(imageView: ImageView, imageUrl: Drawable?) {
            if (imageUrl != null) {
                // If we don't do this, you'll see the old image appear briefly
                // before it's replaced with the current image
                if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrl) {
                    imageView.setImageBitmap(null)
                    imageView.setTag(R.id.image_url, imageUrl)

                    Glide.with(imageView).load(imageUrl)
                        .apply(
                            RequestOptions.bitmapTransform(BlurTransformation(25, 4))
                                .placeholder(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                                .error(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                                .diskCacheStrategy(
                                    DiskCacheStrategy.ALL
                                )
                        )
                        .into(imageView)
                }
            } else {
                imageView.setTag(R.id.image_url, null)
                imageView.setImageBitmap(null)
            }
        }

        @BindingAdapter("imageUrlRoundTopRect")
        @JvmStatic
        fun loadImageUrlRoundTopRect(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)

                var cornerType = RoundedCornersTransformation.CornerType.TOP
                val transformation = MultiTransformation(
                    CenterCrop(),
                    RoundedCornersTransformation(
                        20, 0,
                        cornerType
                    )
                )
                val requestOptions = RequestOptions.bitmapTransform(transformation)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                    .apply(requestOptions)

                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(requestOptions).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlRoundRect")
        @JvmStatic
        fun loadImageUrlRoundRect(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)

                var cornerType = RoundedCornersTransformation.CornerType.ALL
                val transformation = MultiTransformation(
                    CenterCrop(),
                    RoundedCornersTransformation(
                        20, 0,
                        cornerType
                    )
                )
                val requestOptions = RequestOptions.bitmapTransform(transformation)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                    .apply(requestOptions).error(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(requestOptions).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlBigRoundRect")
        @JvmStatic
        fun loadImageUrlBigRoundRect(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)

                var cornerType = RoundedCornersTransformation.CornerType.ALL
                val transformation = MultiTransformation(
                    CenterCrop(),
                    RoundedCornersTransformation(
                        50, 0,
                        cornerType
                    )
                )
                val requestOptions = RequestOptions.bitmapTransform(transformation)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                    .apply(requestOptions)

                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(requestOptions).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlRectResource")
        @JvmStatic
        fun loadImageUrlRectResource(imageView: ImageView, imageUrl: Drawable?) {
            if (imageUrl != null) {
                // If we don't do this, you'll see the old image appear briefly
                // before it's replaced with the current image
                if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrl) {
                    imageView.setImageBitmap(null)
                    imageView.setTag(R.id.image_url, imageUrl)

                    Glide.with(imageView).load(imageUrl)
                        .apply(
                            RequestOptions().placeholder(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                                .error(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                                .diskCacheStrategy(
                                    DiskCacheStrategy.ALL
                                )
                        )
                        .into(imageView)
                }
            } else {
                imageView.setTag(R.id.image_url, null)
                imageView.setImageBitmap(null)
            }
        }

        @BindingAdapter("imageUrlRoundStartRect")
        @JvmStatic
        fun loadImageUrlRoundStartRect(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)

                var cornerType = RoundedCornersTransformation.CornerType.LEFT
                if (Preferences.getApplicationLocale().compareTo("ar") == 0) {
                    cornerType = RoundedCornersTransformation.CornerType.RIGHT
                }
                val transformation = MultiTransformation(
                    CenterCrop(),
                    RoundedCornersTransformation(
                        20, 0,
                        cornerType
                    )
                )
                val requestOptions = RequestOptions.bitmapTransform(transformation)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                    .apply(requestOptions)
                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(requestOptions).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlBigRoundStartRect")
        @JvmStatic
        fun loadImageUrlBigRoundStartRect(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)

                var cornerType = RoundedCornersTransformation.CornerType.LEFT
                if (Preferences.getApplicationLocale().compareTo("ar") == 0) {
                    cornerType = RoundedCornersTransformation.CornerType.RIGHT
                }
                val transformation = MultiTransformation(
                    CenterCrop(),
                    RoundedCornersTransformation(
                        50, 0,
                        cornerType
                    )
                )
                val requestOptions = RequestOptions.bitmapTransform(transformation)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.ic_launcher_background)
                    .apply(requestOptions)
                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(requestOptions).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlBigRoundBottomRect")
        @JvmStatic
        fun loadImageUrlBigRoundBottomRect(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)

                var cornerType = RoundedCornersTransformation.CornerType.BOTTOM
                val transformation = MultiTransformation(
                    CenterCrop(),
                    RoundedCornersTransformation(
                        50, 0,
                        cornerType
                    )
                )
                val requestOptions = RequestOptions.bitmapTransform(transformation)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                    .apply(requestOptions)
                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(requestOptions).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("imageUrlCircle")
        @JvmStatic
        fun loadImageUrlCircle(imageView: ImageView, imageUrlRoundTopRect: String?) {
            var imageUrlRoundTopRectVar = imageUrlRoundTopRect
            if (imageUrlRoundTopRectVar == null)
                imageUrlRoundTopRectVar = ""
            // If we don't do this, you'll see the old image appear briefly
            // before it's replaced with the current image
            if (imageView.getTag(R.id.image_url) == null || imageView.getTag(R.id.image_url) != imageUrlRoundTopRectVar) {
                imageView.setImageBitmap(null)
                imageView.setTag(R.id.image_url, imageUrlRoundTopRectVar)
                val transformation = RequestOptions.circleCropTransform()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                val thumbnail: RequestBuilder<Drawable> = Glide.with(imageView)
                    .load(R.drawable.layout_bg_transparent_gray_selector_with_bg_transparent)
                    .apply(transformation)
                Glide.with(imageView).load(imageUrlRoundTopRectVar)
                    .apply(transformation).thumbnail(thumbnail)
                    .into(imageView)
            }
        }

        @BindingAdapter("bind:layoutHeight")
        @JvmStatic
        fun setHeight(view: View, height: Double) {
            view.layoutParams.height = height.toInt()
            view.requestLayout()
        }

        @BindingAdapter("bind:layoutWidth")
        @JvmStatic
        fun setWidth(view: View, width: Double) {
            view.layoutParams.width = width.toInt()
            view.requestLayout()
        }
    }
}