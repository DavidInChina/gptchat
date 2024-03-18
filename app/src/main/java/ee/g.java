package Ee;

import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.z;
import java.nio.charset.Charset;
import jf.y;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f4714Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f4715Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f4716h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f4717i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ KSerializer f4718j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Charset f4719k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Object obj, KSerializer kSerializer, Charset charset, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4716h0 = iVar;
        this.f4717i0 = obj;
        this.f4718j0 = kSerializer;
        this.f4719k0 = charset;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f4716h0, this.f4717i0, this.f4718j0, this.f4719k0, abstractC4825e);
        gVar.f4715Z = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((z) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f4714Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Object obj2 = this.f4717i0;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>", obj2);
            AbstractC1206i abstractC1206i = (AbstractC1206i) obj2;
            KSerializer kSerializer = this.f4718j0;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>", kSerializer);
            this.f4714Y = 1;
            if (i.a(this.f4716h0, abstractC1206i, kSerializer, this.f4719k0, (z) this.f4715Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
