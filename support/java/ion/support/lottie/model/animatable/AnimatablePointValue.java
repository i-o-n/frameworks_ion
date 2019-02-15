package ion.support.lottie.model.animatable;

import android.graphics.PointF;

import ion.support.lottie.value.Keyframe;
import ion.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import ion.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
