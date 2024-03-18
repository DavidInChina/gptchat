package R3;

import L3.s;
import U3.q;
import android.os.Build;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class f extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f15037c;

    /* renamed from: b  reason: collision with root package name */
    public final int f15038b = 7;

    static {
        String f6 = s.f("NetworkNotRoamingCtrlr");
        AbstractC3557B.b0("tagWithPrefix(\"NetworkNotRoamingCtrlr\")", f6);
        f15037c = f6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(S3.f fVar) {
        super(fVar);
        AbstractC3557B.c0("tracker", fVar);
    }

    @Override // R3.d
    public final int a() {
        return this.f15038b;
    }

    @Override // R3.d
    public final boolean b(q qVar) {
        if (qVar.f17459j.f10699a == 4) {
            return true;
        }
        return false;
    }

    @Override // R3.d
    public final boolean c(Object obj) {
        Q3.d dVar = (Q3.d) obj;
        AbstractC3557B.c0("value", dVar);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = dVar.f14404a;
        if (i10 < 24) {
            s.d().a(f15037c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (z10) {
                return false;
            }
        } else if (z10 && dVar.f14407d) {
            return false;
        }
        return true;
    }
}
