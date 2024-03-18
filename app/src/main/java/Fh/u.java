package Fh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import th.AbstractC5802j;
import th.AbstractC5806n;
import wh.AbstractC6226B;
import wh.AbstractC6235K;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes2.dex */
public final class u implements B, w {

    /* renamed from: Y  reason: collision with root package name */
    public final t f5402Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f5403Z;

    public u(t tVar, AbstractC5806n abstractC5806n) {
        this.f5402Y = tVar;
        this.f5403Z = abstractC5806n;
    }

    public static v c(AbstractC6250o abstractC6250o) {
        w[] wVarArr = new w[2];
        wVarArr[0] = new u(r.f5399Y, abstractC6250o.getDeclaredAnnotations());
        AbstractC6235K<AbstractC6226B> parameters = abstractC6250o.getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        for (AbstractC6226B abstractC6226B : parameters) {
            int index = abstractC6226B.getIndex();
            arrayList.add(new u(new s(index), abstractC6226B.getDeclaredAnnotations()));
        }
        wVarArr[1] = new v(arrayList);
        return new v(Arrays.asList(wVarArr));
    }

    @Override // Fh.B
    public final void b(Nh.l lVar, AbstractC6250o abstractC6250o, o oVar) {
        C0541b c0541b = new C0541b(this.f5402Y.a(lVar, abstractC6250o));
        for (AbstractC5802j abstractC5802j : this.f5403Z) {
            c0541b.a(abstractC5802j, oVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f5402Y.equals(uVar.f5402Y) && this.f5403Z.equals(uVar.f5403Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5402Y.hashCode();
        return this.f5403Z.hashCode() + ((hashCode + (u.class.hashCode() * 31)) * 31);
    }

    @Override // Fh.w
    public final B a(l1 l1Var) {
        return this;
    }
}
