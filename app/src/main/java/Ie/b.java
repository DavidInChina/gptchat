package Ie;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import wf.o;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: Z  reason: collision with root package name */
    public final List f8565Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4831k f8566h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f8567i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8568j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, List list, Object obj2, AbstractC4831k abstractC4831k) {
        super(obj);
        AbstractC3557B.c0("context", obj);
        AbstractC3557B.c0("subject", obj2);
        this.f8565Z = list;
        this.f8566h0 = abstractC4831k;
        this.f8567i0 = obj2;
    }

    @Override // Ie.e
    public final Object a(Object obj, AbstractC4825e abstractC4825e) {
        this.f8568j0 = 0;
        AbstractC3557B.c0("<set-?>", obj);
        this.f8567i0 = obj;
        return c(abstractC4825e);
    }

    @Override // Ie.e
    public final Object b() {
        return this.f8567i0;
    }

    @Override // Ie.e
    public final Object c(AbstractC4825e abstractC4825e) {
        int i10 = this.f8568j0;
        if (i10 < 0) {
            return this.f8567i0;
        }
        if (i10 >= this.f8565Z.size()) {
            this.f8568j0 = -1;
            return this.f8567i0;
        }
        return e(abstractC4825e);
    }

    @Override // Ie.e
    public final Object d(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("<set-?>", obj);
        this.f8567i0 = obj;
        return c(abstractC4825e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC4825e abstractC4825e) {
        a aVar;
        EnumC5000a enumC5000a;
        int i10;
        b bVar;
        int i11;
        o oVar;
        Object obj;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i12 = aVar.f8564i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f8564i0 = i12 - Integer.MIN_VALUE;
                Object obj2 = aVar.f8562Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f8564i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        bVar = aVar.f8561Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    bVar = this;
                }
                do {
                    i11 = bVar.f8568j0;
                    if (i11 == -1) {
                        List list = bVar.f8565Z;
                        if (i11 >= list.size()) {
                            bVar.f8568j0 = -1;
                        } else {
                            oVar = (o) list.get(i11);
                            bVar.f8568j0 = i11 + 1;
                            AbstractC3557B.a0("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }", oVar);
                            obj = bVar.f8567i0;
                            aVar.f8561Y = bVar;
                            aVar.f8564i0 = 1;
                        }
                    }
                    return bVar.f8567i0;
                } while (oVar.invoke(bVar, obj, aVar) != enumC5000a);
                return enumC5000a;
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj22 = aVar.f8562Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = aVar.f8564i0;
        if (i10 == 0) {
        }
        do {
            i11 = bVar.f8568j0;
            if (i11 == -1) {
            }
            return bVar.f8567i0;
        } while (oVar.invoke(bVar, obj, aVar) != enumC5000a);
        return enumC5000a;
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f8566h0;
    }
}
