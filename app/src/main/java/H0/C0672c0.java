package H0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import q1.AbstractC5260f;

/* renamed from: H0.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0672c0 extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6910a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i10 = this.f6910a;
        switch (i10) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    C0676e0 c0676e0 = new C0676e0(choreographer, AbstractC5260f.m(myLooper));
                    return c0676e0.plus(c0676e0.f6948p0);
                }
                throw new IllegalStateException("no Looper on this thread".toString());
            case 1:
                return new PathMeasure();
            case 2:
                switch (i10) {
                    case 2:
                        return new Path();
                    default:
                        return new Path();
                }
            case 3:
                switch (i10) {
                    case 2:
                        return new Path();
                    default:
                        return new Path();
                }
            case 4:
                return new float[4];
            case 5:
                return Boolean.FALSE;
            case 6:
                return 0L;
            case 7:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSzzz", Locale.ROOT);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            case 8:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat2.setLenient(false);
                simpleDateFormat2.setTimeZone(Xh.b.f22000e);
                return simpleDateFormat2;
        }
    }
}
