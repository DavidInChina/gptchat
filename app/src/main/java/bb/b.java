package Bb;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wf.n;
import xe.C6396A;

/* loaded from: classes.dex */
public final class b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2040Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2041Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f2042h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Map f2043i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Map map, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2042h0 = str;
        this.f2043i0 = map;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        b bVar = new b(this.f2042h0, this.f2043i0, abstractC4825e);
        bVar.f2041Z = obj;
        return bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2040Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "aip/p", new C6.a(this.f2042h0, this.f2043i0, c5760d, 12), 7);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f2041Z);
            this.f2040Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
