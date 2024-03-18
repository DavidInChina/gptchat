package Ta;

import Df.H;
import Df.w;
import Jc.z;
import Pg.A;
import Vc.t;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.jvm.internal.C;
import me.AbstractC4630c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;
import ze.AbstractC6848g;
import ze.C6843b;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17009Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17010Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f17011h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f17012i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ byte[] f17013j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, byte[] bArr, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17011h0 = lVar;
        this.f17012i0 = str;
        this.f17013j0 = bArr;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        k kVar = new k(this.f17011h0, this.f17012i0, this.f17013j0, abstractC4825e);
        kVar.f17010Z = obj;
        return kVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((A) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        A a5;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        ?? r12 = this.f17009Y;
        y yVar = y.f36177a;
        try {
        } catch (Exception e10) {
            z zVar = new z(new t(e10));
            this.f17010Z = null;
            this.f17009Y = 3;
            if (((Pg.p) r12).f14244i0.n(zVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        if (r12 != 0) {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 == 3) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    A a10 = (A) this.f17010Z;
                    N.B0(obj);
                }
                return yVar;
            }
            A a11 = (A) this.f17010Z;
            N.B0(obj);
            a5 = a11;
        } else {
            N.B0(obj);
            A a12 = (A) this.f17010Z;
            ge.d dVar = this.f17011h0.f17015b;
            String str = this.f17012i0;
            byte[] bArr = this.f17013j0;
            C5760d c5760d = new C5760d();
            P4.a.Q0(c5760d, str);
            P4.a.d0(c5760d, h.f17000i0);
            if (bArr == null) {
                c5760d.f46128d = C6843b.f52007a;
                w a13 = C.a(byte[].class);
                c5760d.b(R4.b.n2(H.O(a13), C.f37623a.b(byte[].class), a13));
            } else if (bArr instanceof AbstractC6848g) {
                c5760d.f46128d = bArr;
                c5760d.b(null);
            } else {
                c5760d.f46128d = bArr;
                w a14 = C.a(byte[].class);
                c5760d.b(R4.b.n2(H.O(a14), C.f37623a.b(byte[].class), a14));
            }
            j jVar = new j(a12, null);
            c5760d.f46130f.e(AbstractC4630c.f39193a, jVar);
            c5760d.c(C6396A.f49813d);
            C6043l c6043l = new C6043l(c5760d, dVar);
            this.f17010Z = a12;
            this.f17009Y = 1;
            a5 = a12;
            if (c6043l.b(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        z zVar2 = new z(new Vc.w(yVar));
        this.f17010Z = a5;
        this.f17009Y = 2;
        if (((Pg.p) a5).f14244i0.n(zVar2, this) == enumC5000a) {
            return enumC5000a;
        }
        return yVar;
    }
}
