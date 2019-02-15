package ion.support.lottie.model.animatable;

import ion.support.lottie.value.Keyframe;
import ion.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import ion.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import ion.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
