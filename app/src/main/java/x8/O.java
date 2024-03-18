package x8;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final Object f49524a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f49525b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f49526c;

    public O(Object obj, Object obj2, Object obj3) {
        this.f49524a = obj;
        this.f49525b = obj2;
        this.f49526c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f49524a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f49525b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f49526c);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append(Separators.EQUALS);
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append(Separators.EQUALS);
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }
}
