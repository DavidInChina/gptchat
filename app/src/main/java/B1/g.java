package B1;

import android.app.Activity;
import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i10) {
        return new JobInfo.TriggerContentUri(uri, i10);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern c(int i10, int i11) {
        return new MediaCodec.CryptoInfo.Pattern(i10, i11);
    }

    public static /* synthetic */ LocaleList f(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan h(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ boolean x(Activity activity) {
        return activity.isInMultiWindowMode();
    }
}
