package pc;

import com.openai.chatgpt.R;

/* renamed from: pc.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5115A extends K {

    /* renamed from: i0  reason: collision with root package name */
    public static final C5115A f42893i0 = new K(R.string.subscription_on_other_platform_error);

    /* JADX WARN: Type inference failed for: r0v0, types: [pc.A, pc.K] */
    static {
        EnumC5121G enumC5121G = EnumC5121G.f42899Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5115A)) {
            return false;
        }
        C5115A c5115a = (C5115A) obj;
        return true;
    }

    public final int hashCode() {
        return -479572996;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ExistingSubscriptionOnAnotherPlatform";
    }
}
