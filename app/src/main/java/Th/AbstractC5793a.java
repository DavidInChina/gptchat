package th;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Iterator;
import uh.AbstractC5929a;
import wh.AbstractC6242g;
import wh.AbstractC6256u;
import yh.C6641v;
import yh.l1;

/* renamed from: th.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5793a implements AbstractC5802j {

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet f46203b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public static final AbstractC6242g f46204c;

    /* renamed from: d  reason: collision with root package name */
    public static final AbstractC6242g f46205d;

    /* renamed from: a  reason: collision with root package name */
    public transient /* synthetic */ int f46206a;

    static {
        ElementType[] values;
        for (ElementType elementType : ElementType.values()) {
            if (!elementType.name().equals("TYPE_PARAMETER")) {
                f46203b.add(elementType);
            }
        }
        f46204c = (AbstractC6242g) ((AbstractC1239q) ((AbstractC6256u) ((AbstractC1239q) C6641v.l1(Retention.class).i()).f(AbstractC1235m.c("value")))).r();
        f46205d = (AbstractC6242g) ((AbstractC1239q) ((AbstractC6256u) ((AbstractC1239q) C6641v.l1(Target.class).i()).f(AbstractC1235m.c("value")))).r();
    }

    public final RetentionPolicy e() {
        AbstractC5798f Y02 = d().getDeclaredAnnotations().Y0(Retention.class);
        if (Y02 == null) {
            return RetentionPolicy.CLASS;
        }
        return (RetentionPolicy) RetentionPolicy.class.cast(Y02.c(f46204c).a(null).c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5802j)) {
            return false;
        }
        AbstractC5802j abstractC5802j = (AbstractC5802j) obj;
        l1 d10 = d();
        if (!abstractC5802j.d().equals(d10)) {
            return false;
        }
        for (AbstractC6242g abstractC6242g : d10.i()) {
            if (!c(abstractC6242g).equals(abstractC5802j.c(abstractC6242g))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(String str) {
        AbstractC5798f Y02 = d().getDeclaredAnnotations().Y0(Target.class);
        if (Y02 == null) {
            if (str.equals("TYPE_USE")) {
                return true;
            }
            Iterator it = f46203b.iterator();
            while (it.hasNext()) {
                if (((ElementType) it.next()).name().equals(str)) {
                    return true;
                }
            }
        } else {
            for (AbstractC5929a abstractC5929a : (AbstractC5929a[]) AbstractC5929a[].class.cast(((AbstractC5809q) Y02.c(f46205d)).b())) {
                if (abstractC5929a.d().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(ElementType elementType) {
        return f(elementType.name());
    }

    public final int hashCode() {
        int i10 = 0;
        if (this.f46206a == 0) {
            for (AbstractC6242g abstractC6242g : d().i()) {
                i10 += c(abstractC6242g).hashCode() * 31;
            }
        }
        if (i10 == 0) {
            return this.f46206a;
        }
        this.f46206a = i10;
        return i10;
    }

    public final String toString() {
        l1 d10 = d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        EnumC5801i.f46224Y.b(sb2, d10);
        sb2.append('(');
        boolean z10 = true;
        for (AbstractC6242g abstractC6242g : d10.i()) {
            h0 c10 = c(abstractC6242g);
            if (c10.getState() != 1) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                EnumC5801i.f46224Y.a(sb2, abstractC6242g.getName(), d10.i().size());
                sb2.append(c10);
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
