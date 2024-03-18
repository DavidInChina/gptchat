package r7;

import android.content.Context;
import t7.e;
import u7.g;

/* renamed from: r7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5371a extends g {

    /* renamed from: k  reason: collision with root package name */
    public static int f44459k = 1;

    public final synchronized int c() {
        int i10;
        try {
            i10 = f44459k;
            if (i10 == 1) {
                Context context = this.f46456a;
                e eVar = e.f45771d;
                int b10 = eVar.b(context, 12451000);
                if (b10 == 0) {
                    i10 = 4;
                    f44459k = 4;
                } else if (eVar.a(b10, context, null) == null && C7.a.a(context) != 0) {
                    i10 = 3;
                    f44459k = 3;
                } else {
                    i10 = 2;
                    f44459k = 2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
