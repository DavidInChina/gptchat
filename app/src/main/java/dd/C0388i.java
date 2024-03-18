package Dd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Dd.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388i {
    public static final C0387h Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f3561b = {Ed.i.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final Ed.i f3562a;

    public C0388i() {
        this.f3562a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0388i) && this.f3562a == ((C0388i) obj).f3562a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Ed.i iVar = this.f3562a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "LegacyVoiceSettings(selectedVoice=" + this.f3562a + Separators.RPAREN;
    }

    public C0388i(int i10, Ed.i iVar) {
        if ((i10 & 1) == 0) {
            this.f3562a = null;
        } else {
            this.f3562a = iVar;
        }
    }
}
