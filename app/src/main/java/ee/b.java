package Ee;

import Kg.p;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import eh.AbstractC2904d;
import eh.EnumC2902b;
import fh.C3067J;
import fh.C3089p;
import fh.C3095v;
import id.AbstractC3557B;
import io.ktor.utils.io.x;
import java.util.Iterator;
import jf.C3963m;
import jf.y;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ x f4697Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Je.a f4698Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2904d f4699h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Je.a aVar, x xVar, AbstractC4825e abstractC4825e, AbstractC2904d abstractC2904d) {
        super(2, abstractC4825e);
        this.f4697Y = xVar;
        this.f4698Z = aVar;
        this.f4699h0 = abstractC2904d;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new b(this.f4698Z, this.f4697Y, abstractC4825e, this.f4699h0);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC2902b enumC2902b;
        Iterator it;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C3963m c3963m = io.ktor.utils.io.jvm.javaio.e.f33497a;
        x xVar = this.f4697Y;
        AbstractC3557B.c0("<this>", xVar);
        io.ktor.utils.io.jvm.javaio.i iVar = new io.ktor.utils.io.jvm.javaio.i(xVar, null);
        Je.a g10 = r.f.g(this.f4698Z);
        AbstractC2904d abstractC2904d = this.f4699h0;
        KSerializer y02 = N.y0(abstractC2904d.f29417b, g10);
        EnumC2902b enumC2902b2 = EnumC2902b.f29412Y;
        C3067J c3067j = new C3067J(new C3089p(iVar), new char[16384]);
        if (c3067j.w() == 8) {
            c3067j.g((byte) 8);
            enumC2902b = EnumC2902b.f29413Z;
        } else {
            enumC2902b = EnumC2902b.f29412Y;
        }
        int ordinal = enumC2902b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
            }
            it = new C3095v(abstractC2904d, c3067j, y02);
        } else {
            it = new Kg.g(abstractC2904d, c3067j, y02);
        }
        return p.a1(new Kg.n(it, 1));
    }
}
