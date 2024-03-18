package r0;

import android.app.NotificationChannel;
import android.graphics.ColorSpace;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class s {
    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ ColorSpace.Rgb.TransferParameters g(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return new ColorSpace.Rgb.TransferParameters(d10, d11, d12, d13, d14, d15, d16);
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Rgb h(Object obj) {
        return (ColorSpace.Rgb) obj;
    }

    public static /* synthetic */ ColorSpace.Rgb i(String str, float[] fArr, float[] fArr2, ColorSpace.Rgb.TransferParameters transferParameters) {
        return new ColorSpace.Rgb(str, fArr, fArr2, transferParameters);
    }

    public static /* synthetic */ ColorSpace.Rgb j(String str, float[] fArr, float[] fArr2, t tVar, t tVar2, float f6, float f10) {
        return new ColorSpace.Rgb(str, fArr, fArr2, tVar, tVar2, f6, f10);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder l(AudioFocusRequest.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAudioAttributes(audioAttributes);
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void x() {
    }
}
