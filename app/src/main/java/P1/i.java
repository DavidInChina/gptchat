package P1;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.Map;
import jf.y;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class i extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f13783Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f13784Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ n f13785h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13785h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        i iVar = new i(this.f13785h0, abstractC4825e);
        iVar.f13784Z = obj;
        return iVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((h) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13783Y;
        if (i10 != 0) {
            if (i10 == 1) {
                b bVar = (b) this.f13784Z;
                N.B0(obj);
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        h hVar = (h) this.f13784Z;
        hVar.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((b) hVar).f13775a);
        AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap);
        b bVar2 = new b(AbstractC4268D.m1(unmodifiableMap), false);
        this.f13784Z = bVar2;
        this.f13783Y = 1;
        if (this.f13785h0.invoke(bVar2, this) == enumC5000a) {
            return enumC5000a;
        }
        return bVar2;
    }
}
