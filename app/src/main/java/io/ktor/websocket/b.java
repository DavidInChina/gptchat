package io.ktor.websocket;

import id.AbstractC3557B;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final short f33613a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33614b;

    public b(String str, short s10) {
        AbstractC3557B.c0("message", str);
        this.f33613a = s10;
        this.f33614b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f33613a == bVar.f33613a && AbstractC3557B.K(this.f33614b, bVar.f33614b);
    }

    public final int hashCode() {
        return this.f33614b.hashCode() + (this.f33613a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseReason(reason=");
        LinkedHashMap linkedHashMap = EnumC3606a.f33606Z;
        LinkedHashMap linkedHashMap2 = EnumC3606a.f33606Z;
        short s10 = this.f33613a;
        Object obj = (EnumC3606a) linkedHashMap2.get(Short.valueOf(s10));
        if (obj == null) {
            obj = Short.valueOf(s10);
        }
        sb2.append(obj);
        sb2.append(", message=");
        return android.gov.nist.core.a.n(sb2, this.f33614b, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(EnumC3606a enumC3606a, String str) {
        this(str, enumC3606a.f33612Y);
        AbstractC3557B.c0("message", str);
    }
}
