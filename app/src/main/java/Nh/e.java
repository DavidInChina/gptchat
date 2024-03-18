package Nh;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f13047a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13048b;

    /* renamed from: c  reason: collision with root package name */
    public final j f13049c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f13050d;

    public e(String str, String str2, j jVar, Object... objArr) {
        this.f13047a = str;
        this.f13048b = str2;
        this.f13049c = jVar;
        this.f13050d = objArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13047a.equals(eVar.f13047a) && this.f13048b.equals(eVar.f13048b) && this.f13049c.equals(eVar.f13049c) && Arrays.equals(this.f13050d, eVar.f13050d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13047a.hashCode() ^ Integer.rotateLeft(this.f13048b.hashCode(), 8)) ^ Integer.rotateLeft(this.f13049c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f13050d), 24);
    }

    public final String toString() {
        return this.f13047a + " : " + this.f13048b + ' ' + this.f13049c + ' ' + Arrays.toString(this.f13050d);
    }
}
