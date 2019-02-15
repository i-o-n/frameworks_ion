package ion.support.lottie.model.animatable;

import ion.support.lottie.animation.keyframe.BaseKeyframeAnimation;

public interface AnimatableValue<K, A> {
  BaseKeyframeAnimation<K, A> createAnimation();
}
