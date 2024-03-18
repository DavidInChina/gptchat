package w9;

import Lg.n;
import Z.AbstractC1710f0;
import Z.l1;
import android.util.Base64;
import id.AbstractC3557B;
import java.util.Arrays;
import jf.y;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import r0.I;
import r0.r;
import r0.x;
import wf.k;
import z.C6721r0;

/* renamed from: w9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6144a extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48237Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f48238Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f48239h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l1 f48240i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6144a(long j6, C6721r0 c6721r0, C6721r0 c6721r02) {
        super(1);
        this.f48238Z = j6;
        this.f48239h0 = c6721r0;
        this.f48240i0 = c6721r02;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f48237Y;
        long j6 = this.f48238Z;
        Object obj2 = this.f48239h0;
        l1 l1Var = this.f48240i0;
        switch (i10) {
            case 0:
                x xVar = (x) obj;
                AbstractC3557B.c0("$this$graphicsLayer", xVar);
                l1 l1Var2 = (l1) obj2;
                I i11 = (I) xVar;
                i11.e(((Number) l1Var2.getValue()).floatValue());
                i11.f(((Number) l1Var2.getValue()).floatValue());
                i11.a(((Number) l1Var.getValue()).floatValue());
                i11.l(j6);
                return yVar;
            default:
                Oc.d dVar = (Oc.d) obj;
                AbstractC3557B.c0("view", dVar);
                if (((Boolean) ((AbstractC1710f0) l1Var).getValue()).booleanValue()) {
                    byte[] bytes = n.U2((String) obj2).toString().getBytes(Lg.a.f11131a);
                    AbstractC3557B.b0("getBytes(...)", bytes);
                    float f6 = 255;
                    dVar.evaluateJavascript("renderLatex('" + Base64.encodeToString(bytes, 2) + "', '" + String.format("#%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC4344b.Y0(r.h(j6) * f6)), Integer.valueOf(AbstractC4344b.Y0(r.g(j6) * f6)), Integer.valueOf(AbstractC4344b.Y0(r.e(j6) * f6)), Integer.valueOf(AbstractC4344b.Y0(r.d(j6) * f6))}, 4)) + "')", null);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6144a(String str, long j6, AbstractC1710f0 abstractC1710f0) {
        super(1);
        this.f48239h0 = str;
        this.f48238Z = j6;
        this.f48240i0 = abstractC1710f0;
    }
}
