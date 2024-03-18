package Z1;

import android.os.Trace;

/* loaded from: classes2.dex */
public final class G0 {

    /* renamed from: a  reason: collision with root package name */
    public static final G0 f22833a = new Object();

    public final void a(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public final void b(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }
}
