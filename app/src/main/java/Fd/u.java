package Fd;

import android.gov.nist.core.Separators;
import android.service.voice.VoiceInteractionSession;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class u implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final VoiceInteractionSession.AssistState f5281a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f5282b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5283c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5284d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5285e;

    public u(VoiceInteractionSession.AssistState assistState, Boolean bool, boolean z10, boolean z11, boolean z12) {
        this.f5281a = assistState;
        this.f5282b = bool;
        this.f5283c = z10;
        this.f5284d = z11;
        this.f5285e = z12;
    }

    public static u e(u uVar, Boolean bool, boolean z10, boolean z11, int i10) {
        VoiceInteractionSession.AssistState assistState = uVar.f5281a;
        if ((i10 & 2) != 0) {
            bool = uVar.f5282b;
        }
        Boolean bool2 = bool;
        if ((i10 & 4) != 0) {
            z10 = uVar.f5283c;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = uVar.f5284d;
        }
        boolean z13 = uVar.f5285e;
        uVar.getClass();
        return new u(assistState, bool2, z12, z11, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f5281a, uVar.f5281a) && AbstractC3557B.K(this.f5282b, uVar.f5282b) && this.f5283c == uVar.f5283c && this.f5284d == uVar.f5284d && this.f5285e == uVar.f5285e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        VoiceInteractionSession.AssistState assistState = this.f5281a;
        if (assistState != null) {
            i10 = assistState.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        Boolean bool = this.f5282b;
        if (bool != null) {
            i13 = bool.hashCode();
        }
        int i15 = (i14 + i13) * 31;
        int i16 = 1237;
        if (this.f5283c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i17 = (i15 + i11) * 31;
        if (this.f5284d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i18 = (i17 + i12) * 31;
        if (this.f5285e) {
            i16 = 1231;
        }
        return i18 + i16;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistantState(assistState=");
        sb2.append(this.f5281a);
        sb2.append(", needsVoiceDisclosure=");
        sb2.append(this.f5282b);
        sb2.append(", isMinimized=");
        sb2.append(this.f5283c);
        sb2.append(", showNotification=");
        sb2.append(this.f5284d);
        sb2.append(", enableMinimizeAssistant=");
        return AbstractC4194d.w(sb2, this.f5285e, Separators.RPAREN);
    }
}
