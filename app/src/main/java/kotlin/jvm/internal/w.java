package kotlin.jvm.internal;

import Df.AbstractC0404c;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class w extends AbstractC4305d implements Df.v {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f37644Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, r8);
        boolean z10;
        boolean z11 = false;
        if ((i10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37644Y = (i10 & 2) == 2 ? true : z11;
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0404c compute() {
        if (this.f37644Y) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (getOwner().equals(wVar.getOwner()) && getName().equals(wVar.getName()) && getSignature().equals(wVar.getSignature()) && AbstractC3557B.K(getBoundReceiver(), wVar.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof Df.v)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    /* renamed from: f */
    public final Df.v getReflected() {
        if (!this.f37644Y) {
            AbstractC0404c compute = compute();
            if (compute != this) {
                return (Df.v) compute;
            }
            throw new Lc.l();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        AbstractC0404c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
