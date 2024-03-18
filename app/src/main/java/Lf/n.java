package Lf;

import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;
import l8.AbstractC4344b;
import ng.AbstractC4838e;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f11107Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, int i10) {
        super(1);
        this.f11106Y = i10;
        this.f11107Z = qVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f11106Y;
        boolean z10 = false;
        q qVar = this.f11107Z;
        switch (i10) {
            case 0:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0("<name for destructuring parameter 0>", c3959i);
                String str = (String) c3959i.f36156Z;
                List F02 = AbstractC4344b.F0(Nf.f.a(qVar.f11114a.j(), Separators.QUOTE + ((String) c3959i.f36155Y) + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str + "()' stdlib extension instead", str + "()", 4));
                if (F02.isEmpty()) {
                    return Nf.h.f12822a;
                }
                return new Nf.j(0, F02);
            default:
                AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
                if (abstractC0994c.e() == 1) {
                    e eVar = qVar.f11115b;
                    AbstractC1003l mo20k = abstractC0994c.mo20k();
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k);
                    eVar.getClass();
                    String str2 = d.f11067a;
                    if (d.f11076j.containsKey(AbstractC4838e.g((AbstractC0997f) mo20k))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
