package Id;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class l implements s {

    /* renamed from: a  reason: collision with root package name */
    public final List f8557a;

    /* renamed from: b  reason: collision with root package name */
    public final Ed.i f8558b;

    /* renamed from: c  reason: collision with root package name */
    public final Ed.i f8559c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8560d;

    public l(List list, Ed.i iVar, Ed.i iVar2, boolean z10) {
        AbstractC3557B.c0("voices", list);
        this.f8557a = list;
        this.f8558b = iVar;
        this.f8559c = iVar2;
        this.f8560d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static l e(l lVar, ArrayList arrayList, Ed.i iVar, Ed.i iVar2, boolean z10, int i10) {
        ArrayList arrayList2 = arrayList;
        if ((i10 & 1) != 0) {
            arrayList2 = lVar.f8557a;
        }
        if ((i10 & 2) != 0) {
            iVar = lVar.f8558b;
        }
        if ((i10 & 4) != 0) {
            iVar2 = lVar.f8559c;
        }
        if ((i10 & 8) != 0) {
            z10 = lVar.f8560d;
        }
        lVar.getClass();
        AbstractC3557B.c0("voices", arrayList2);
        return new l(arrayList2, iVar, iVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f8557a, lVar.f8557a) && this.f8558b == lVar.f8558b && this.f8559c == lVar.f8559c && this.f8560d == lVar.f8560d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f8557a.hashCode() * 31;
        int i12 = 0;
        Ed.i iVar = this.f8558b;
        if (iVar == null) {
            i10 = 0;
        } else {
            i10 = iVar.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        Ed.i iVar2 = this.f8559c;
        if (iVar2 != null) {
            i12 = iVar2.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        if (this.f8560d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i14 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VoiceSettingsState(voices=");
        sb2.append(this.f8557a);
        sb2.append(", defaultVoice=");
        sb2.append(this.f8558b);
        sb2.append(", selectedVoice=");
        sb2.append(this.f8559c);
        sb2.append(", muted=");
        return AbstractC4194d.w(sb2, this.f8560d, Separators.RPAREN);
    }
}
