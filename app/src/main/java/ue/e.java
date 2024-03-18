package ue;

import id.AbstractC3557B;
import java.io.Serializable;
import xe.AbstractC6432u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f46724a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f46725b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6432u f46726c;

    public e(String str, Serializable serializable, AbstractC6432u abstractC6432u) {
        this.f46724a = str;
        this.f46725b = serializable;
        this.f46726c = abstractC6432u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f46724a, eVar.f46724a) && AbstractC3557B.K(this.f46725b, eVar.f46725b) && AbstractC3557B.K(this.f46726c, eVar.f46726c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f46725b.hashCode();
        return this.f46726c.hashCode() + ((hashCode + (this.f46724a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FormPart(key=" + this.f46724a + ", value=" + this.f46725b + ", headers=" + this.f46726c + ')';
    }
}
