package pc;

import com.openai.chatgpt.R;

/* loaded from: classes2.dex */
public final class J extends K {

    /* renamed from: i0  reason: collision with root package name */
    public static final J f42905i0 = new K(R.string.subscriptions_already_subscribed_cta);

    /* JADX WARN: Type inference failed for: r0v0, types: [pc.K, pc.J] */
    static {
        EnumC5121G enumC5121G = EnumC5121G.f42899Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j6 = (J) obj;
        return true;
    }

    public final int hashCode() {
        return -411305569;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "WorkspaceAccountsCannotSubscribe";
    }
}
