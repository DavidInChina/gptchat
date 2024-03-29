package livekit.org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;

/* loaded from: classes.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* renamed from: livekit.org.webrtc.RendererCommon$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface GlDrawer {
        void drawOes(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16);

        void drawRgb(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16);

        void drawYuv(int[] iArr, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15);

        void release();
    }

    /* loaded from: classes.dex */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i10, int i11, int i12);
    }

    /* loaded from: classes2.dex */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* loaded from: classes.dex */
    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(int i10, int i11, int i12, int i13) {
            boolean z10;
            float f6;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i10);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i11);
            if (i12 != 0 && i13 != 0 && defaultSize != 0 && defaultSize2 != 0) {
                float f10 = i12 / i13;
                float f11 = defaultSize / defaultSize2;
                boolean z11 = false;
                if (f10 > 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f11 > 1.0f) {
                    z11 = true;
                }
                if (z10 == z11) {
                    f6 = this.visibleFractionMatchOrientation;
                } else {
                    f6 = this.visibleFractionMismatchOrientation;
                }
                Point displaySize = RendererCommon.getDisplaySize(f6, f10, defaultSize, defaultSize2);
                if (View.MeasureSpec.getMode(i10) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i11) == 1073741824) {
                    displaySize.y = defaultSize2;
                }
                return displaySize;
            }
            return new Point(defaultSize, defaultSize2);
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f6, float f10) {
            this.visibleFractionMatchOrientation = f6;
            this.visibleFractionMismatchOrientation = f10;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f6 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f6;
        float f10 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f10;
        fArr[12] = f6 + 0.5f;
        fArr[13] = f10 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i10 = AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return BALANCED_VISIBLE_FRACTION;
                }
                throw new IllegalArgumentException();
            }
            return 0.0f;
        }
        return 1.0f;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f6, int i10, int i11) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f6, i10, i11);
    }

    public static float[] getLayoutMatrix(boolean z10, float f6, float f10) {
        float f11;
        float f12;
        if (f10 > f6) {
            f12 = f6 / f10;
            f11 = 1.0f;
        } else {
            f11 = f10 / f6;
            f12 = 1.0f;
        }
        if (z10) {
            f11 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f11, f12, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f6, float f10, int i10, int i11) {
        if (f6 != 0.0f && f10 != 0.0f) {
            return new Point(Math.min(i10, Math.round((i11 / f6) * f10)), Math.min(i11, Math.round((i10 / f6) / f10)));
        }
        return new Point(i10, i11);
    }
}
