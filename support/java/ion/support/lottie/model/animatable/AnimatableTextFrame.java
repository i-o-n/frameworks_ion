package ion.support.lottie.model.animatable;

import ion.support.lottie.value.Keyframe;
import ion.support.lottie.animation.keyframe.TextKeyframeAnimation;
import ion.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
