package pc;

import com.openai.chatgpt.R;

/* renamed from: pc.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5118D extends K {

    /* renamed from: i0  reason: collision with root package name */
    public static final C5118D f42896i0 = new K(R.string.subscriptions_error_generic_unavailable);

    /* JADX WARN: Type inference failed for: r0v0, types: [pc.K, pc.D] */
    static {
        EnumC5121G enumC5121G = EnumC5121G.f42899Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5118D)) {
            return false;
        }
        C5118D c5118d = (C5118D) obj;
        return true;
    }

    public final int hashCode() {
        return 146492040;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoPackagesAvailable";
    }
}
