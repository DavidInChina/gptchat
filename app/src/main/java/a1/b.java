package A1;

import android.content.ClipData;
import android.content.res.Configuration;
import android.media.MediaDrm;
import android.view.ContentInfo;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof SplashScreenView;
    }

    public static /* bridge */ /* synthetic */ int C(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static /* bridge */ /* synthetic */ ContentInfo D(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ int a(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ int c(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static /* bridge */ /* synthetic */ ClipData d(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent f(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder g(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* bridge */ /* synthetic */ ContentInfo i(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder m(AutofillId autofillId, long j6) {
        return new ViewTranslationRequest.Builder(autofillId, j6);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse o(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView p(Object obj) {
        return (SplashScreenView) obj;
    }

    public static /* synthetic */ void s() {
    }
}
