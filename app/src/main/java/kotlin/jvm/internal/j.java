package kotlin.jvm.internal;

import Df.AbstractC0404c;
import Df.AbstractC0408g;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class j extends AbstractC4305d implements i, AbstractC0408g {
    private final int arity;
    private final int flags;

    public j(int i10) {
        this(i10, AbstractC4305d.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public AbstractC0404c computeReflected() {
        return C.f37623a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && AbstractC3557B.K(getBoundReceiver(), jVar.getBoundReceiver()) && AbstractC3557B.K(getOwner(), jVar.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof AbstractC0408g)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i10;
        if (getOwner() == null) {
            i10 = 0;
        } else {
            i10 = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + i10) * 31);
    }

    @Override // Df.AbstractC0408g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Df.AbstractC0408g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Df.AbstractC0408g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Df.AbstractC0408g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // Df.AbstractC0404c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        AbstractC0404c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public AbstractC0408g getReflected() {
        AbstractC0404c compute = compute();
        if (compute != this) {
            return (AbstractC0408g) compute;
        }
        throw new Lc.l();
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }
}
