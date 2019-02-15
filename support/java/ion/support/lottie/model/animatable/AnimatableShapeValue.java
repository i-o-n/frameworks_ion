package ion.support.lottie.model.animatable;

import android.graphics.Path;

import ion.support.lottie.value.Keyframe;
import ion.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import ion.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import ion.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
