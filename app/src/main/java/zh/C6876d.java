package zh;

/* renamed from: zh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6876d implements AbstractC6877e {

    /* renamed from: a  reason: collision with root package name */
    public final String f52123a;

    public C6876d(String str) {
        this.f52123a = str;
    }

    @Override // zh.AbstractC6877e
    public final byte[] a() {
        throw new IllegalStateException("Could not locate class file for " + this.f52123a);
    }

    @Override // zh.AbstractC6877e
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6876d.class != obj.getClass()) {
            return false;
        }
        if (this.f52123a.equals(((C6876d) obj).f52123a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52123a.hashCode() + (C6876d.class.hashCode() * 31);
    }
}
