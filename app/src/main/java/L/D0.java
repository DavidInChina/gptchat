package L;

import T0.C1406a;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import h.C3281g;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import z0.C6739b;

/* loaded from: classes.dex */
public final /* synthetic */ class D0 extends kotlin.jvm.internal.k implements wf.k {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.jvm.internal.x] */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C1406a c1406a;
        EnumC0847f0 c10;
        Integer num;
        KeyEvent keyEvent = ((C6739b) obj).f51432a;
        C0 c02 = (C0) this.receiver;
        c02.getClass();
        boolean z10 = true;
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            V v10 = c02.f9873i;
            v10.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                v10.f10078a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                num = null;
            } else {
                Integer num2 = v10.f10078a;
                if (num2 != null) {
                    v10.f10078a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num2.intValue(), unicodeChar);
                    num = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        num = null;
                    }
                    if (num == null) {
                        num = Integer.valueOf(unicodeChar);
                    }
                } else {
                    num = Integer.valueOf(unicodeChar);
                }
            }
            if (num != null) {
                c1406a = new C1406a(new StringBuilder().appendCodePoint(num.intValue()).toString(), 1);
                N.x0 x0Var = c02.f9870f;
                boolean z11 = c02.f9868d;
                boolean z12 = false;
                if (c1406a == null) {
                    if (z11) {
                        c02.a(AbstractC4344b.F0(c1406a));
                        x0Var.f12451a = null;
                    } else {
                        z10 = false;
                    }
                    z12 = z10;
                } else if (r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 2) && (c10 = c02.f9874j.c(keyEvent)) != null && (!c10.f10170Y || z11)) {
                    ?? obj2 = new Object();
                    obj2.f37645Y = true;
                    C3281g c3281g = new C3281g(c10, c02, obj2, 14);
                    Q0 d10 = c02.f9865a.d();
                    T0.z zVar = c02.f9867c;
                    N.q0 q0Var = new N.q0(zVar, c02.f9871g, d10, x0Var);
                    c3281g.invoke(q0Var);
                    if (!N0.D.a(q0Var.f12343f, zVar.f16831b) || !AbstractC3557B.K(q0Var.f12344g, zVar.f16830a)) {
                        c02.f9875k.invoke(T0.z.a(zVar, q0Var.f12344g, q0Var.f12343f, 4));
                    }
                    R0 r02 = c02.f9872h;
                    if (r02 != null) {
                        r02.f10062f = true;
                    }
                    z12 = obj2.f37645Y;
                }
                return Boolean.valueOf(z12);
            }
        }
        c1406a = null;
        N.x0 x0Var2 = c02.f9870f;
        boolean z112 = c02.f9868d;
        boolean z122 = false;
        if (c1406a == null) {
        }
        return Boolean.valueOf(z122);
    }
}
