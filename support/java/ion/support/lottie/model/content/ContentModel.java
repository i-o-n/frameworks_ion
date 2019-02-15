package ion.support.lottie.model.content;


import android.support.annotation.Nullable;

import ion.support.lottie.LottieDrawable;
import ion.support.lottie.animation.content.Content;
import ion.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
