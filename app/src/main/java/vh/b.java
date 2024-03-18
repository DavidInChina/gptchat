package vh;

import java.lang.reflect.Field;
import th.AbstractC5806n;
import th.C5805m;
import yh.AbstractC6635s;
import yh.C6633q0;
import yh.C6641v;
import yh.Z;
import yh.l1;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: Z  reason: collision with root package name */
    public final Field f47534Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient /* synthetic */ C5805m f47535h0;

    public b(Field field) {
        this.f47534Z = field;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5636h
    public final boolean M() {
        return this.f47534Z.isSynthetic();
    }

    @Override // vh.c, vh.g, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return C6641v.l1(this.f47534Z.getDeclaringClass());
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        C5805m c5805m;
        if (this.f47535h0 != null) {
            c5805m = null;
        } else {
            c5805m = new C5805m(this.f47534Z.getDeclaredAnnotations());
        }
        if (c5805m == null) {
            return this.f47535h0;
        }
        this.f47535h0 = c5805m;
        return c5805m;
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f47534Z.getName();
    }

    @Override // vh.g
    public final l1.a getType() {
        boolean z10 = AbstractC6635s.f51074Z;
        Field field = this.f47534Z;
        if (z10) {
            return C6633q0.i1(field.getType());
        }
        return new Z(field);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f47534Z.getModifiers();
    }
}
