package ion.support.lottie.animation.keyframe;

import ion.support.lottie.value.Keyframe;
import ion.support.lottie.model.DocumentData;

import java.util.List;

public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
  public TextKeyframeAnimation(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override DocumentData getValue(Keyframe<DocumentData> keyframe, float keyframeProgress) {
    return keyframe.startValue;
  }
}
