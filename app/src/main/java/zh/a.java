package Zh;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f23761a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23762b;

    /* renamed from: c  reason: collision with root package name */
    public c f23763c;

    /* renamed from: d  reason: collision with root package name */
    public long f23764d = -1;

    public a(String str, boolean z10) {
        AbstractC3557B.c0("name", str);
        this.f23761a = str;
        this.f23762b = z10;
    }

    public abstract long a();

    public final String toString() {
        return this.f23761a;
    }
}
