package Hi;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f7858a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f7859b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7860c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7861d;

    public d(String str, Long l10, Integer num, String str2) {
        this.f7858a = str;
        this.f7859b = l10;
        this.f7860c = num;
        this.f7861d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f7858a, dVar.f7858a) && AbstractC3557B.K(this.f7859b, dVar.f7859b) && AbstractC3557B.K(this.f7860c, dVar.f7860c) && AbstractC3557B.K(this.f7861d, dVar.f7861d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f7858a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        Long l10 = this.f7859b;
        if (l10 == null) {
            i11 = 0;
        } else {
            i11 = l10.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Integer num = this.f7860c;
        if (num == null) {
            i12 = 0;
        } else {
            i12 = num.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str2 = this.f7861d;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "AppTask(topActivity=" + ((Object) this.f7858a) + ", elapsedSinceLastActiveRealtimeMillis=" + this.f7859b + ", numActivities=" + this.f7860c + ", baseIntent=" + ((Object) this.f7861d) + ')';
    }
}
