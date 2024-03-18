package f7;

import android.content.Context;
import m7.AbstractC4565a;

/* renamed from: f7.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2939b extends AbstractC2940c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29645a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4565a f29646b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4565a f29647c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29648d;

    public C2939b(Context context, AbstractC4565a abstractC4565a, AbstractC4565a abstractC4565a2, String str) {
        if (context != null) {
            this.f29645a = context;
            if (abstractC4565a != null) {
                this.f29646b = abstractC4565a;
                if (abstractC4565a2 != null) {
                    this.f29647c = abstractC4565a2;
                    if (str != null) {
                        this.f29648d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2940c)) {
            return false;
        }
        AbstractC2940c abstractC2940c = (AbstractC2940c) obj;
        if (this.f29645a.equals(((C2939b) abstractC2940c).f29645a)) {
            C2939b c2939b = (C2939b) abstractC2940c;
            if (this.f29646b.equals(c2939b.f29646b) && this.f29647c.equals(c2939b.f29647c) && this.f29648d.equals(c2939b.f29648d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f29645a.hashCode() ^ 1000003) * 1000003) ^ this.f29646b.hashCode()) * 1000003) ^ this.f29647c.hashCode()) * 1000003) ^ this.f29648d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f29645a);
        sb2.append(", wallClock=");
        sb2.append(this.f29646b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f29647c);
        sb2.append(", backendName=");
        return R.a.t(sb2, this.f29648d, "}");
    }
}
