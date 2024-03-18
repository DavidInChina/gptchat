package U;

import Z.C1718j0;
import com.google.android.gms.internal.play_billing.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.k implements wf.k {
    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        float floatValue = ((Number) obj).floatValue();
        n nVar = (n) this.receiver;
        float f10 = 0.0f;
        if (!nVar.c()) {
            C1718j0 c1718j0 = nVar.f17370f;
            float j6 = N.j(c1718j0.h() + floatValue, 0.0f);
            float h10 = j6 - c1718j0.h();
            c1718j0.i(j6);
            float a5 = nVar.a();
            C1718j0 c1718j02 = nVar.f17371g;
            if (a5 <= c1718j02.h()) {
                f6 = nVar.a();
            } else {
                float o10 = N.o(Math.abs(nVar.a() / nVar.b()) - 1.0f, 0.0f, 2.0f);
                f6 = c1718j02.h() + (c1718j02.h() * (o10 - (((float) Math.pow(o10, 2)) / 4)));
            }
            nVar.f17369e.i(f6);
            f10 = h10;
        }
        return Float.valueOf(f10);
    }
}
