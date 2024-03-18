package ca;

import aa.EnumC1942e;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* renamed from: ca.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2331w extends N {

    /* renamed from: g  reason: collision with root package name */
    public final EnumC1942e f26423g;

    public C2331w(EnumC1942e enumC1942e) {
        AbstractC3557B.c0("voiceAction", enumC1942e);
        this.f26423g = enumC1942e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2331w) && this.f26423g == ((C2331w) obj).f26423g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26423g.hashCode();
    }

    public final String toString() {
        return "VoiceActionData(voiceAction=" + this.f26423g + Separators.RPAREN;
    }
}
