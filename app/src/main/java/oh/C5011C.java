package oh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* renamed from: oh.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5011C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f41362Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f41363Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41364h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f41365i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ I f41366j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5011C(kotlin.jvm.internal.B b10, I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41365i0 = b10;
        this.f41366j0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5011C c5011c = new C5011C(this.f41365i0, this.f41366j0, abstractC4825e);
        c5011c.f41364h0 = obj;
        return c5011c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5011C) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5017d c5017d;
        Object obj2;
        y yVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41363Z;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.jvm.internal.B b10 = this.f41362Y;
                c5017d = (C5017d) this.f41364h0;
                N.B0(obj);
                b10.f37622Y = obj;
                b10 = this.f41365i0;
                obj2 = b10.f37622Y;
                if (!(obj2 instanceof C5009A)) {
                    if (obj2 instanceof y) {
                        yVar = (y) obj2;
                    } else {
                        yVar = null;
                    }
                    if (yVar != null) {
                        c5017d.f41409a.f41410a.h(Float.valueOf(yVar.f41482j), new C5251c(yVar.f41483k), Float.valueOf(yVar.f41484l), new C5251c(yVar.f41485m));
                    }
                    Pg.k kVar = this.f41366j0.f41386B0;
                    this.f41364h0 = c5017d;
                    this.f41362Y = b10;
                    this.f41363Z = 1;
                    obj = kVar.g(this);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    b10.f37622Y = obj;
                    b10 = this.f41365i0;
                    obj2 = b10.f37622Y;
                    if (!(obj2 instanceof C5009A)) {
                    }
                } else {
                    return jf.y.f36177a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            c5017d = (C5017d) this.f41364h0;
            b10 = this.f41365i0;
            obj2 = b10.f37622Y;
            if (!(obj2 instanceof C5009A)) {
            }
        }
    }
}
