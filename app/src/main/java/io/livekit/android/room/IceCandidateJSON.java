package io.livekit.android.room;

import R4.b;
import ah.AbstractC1998i;
import android.gov.nist.core.a;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/livekit/android/room/IceCandidateJSON;", "", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IceCandidateJSON {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f33702a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33703b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33704c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/livekit/android/room/IceCandidateJSON$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/IceCandidateJSON;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livekit-android-sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return IceCandidateJSON$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IceCandidateJSON(int i10, int i11, String str, String str2) {
        if (7 != (i10 & 7)) {
            b.e2(i10, 7, IceCandidateJSON$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f33702a = str;
        this.f33703b = i11;
        this.f33704c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceCandidateJSON)) {
            return false;
        }
        IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) obj;
        return AbstractC3557B.K(this.f33702a, iceCandidateJSON.f33702a) && this.f33703b == iceCandidateJSON.f33703b && AbstractC3557B.K(this.f33704c, iceCandidateJSON.f33704c);
    }

    public final int hashCode() {
        int hashCode = ((this.f33702a.hashCode() * 31) + this.f33703b) * 31;
        String str = this.f33704c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IceCandidateJSON(candidate=");
        sb2.append(this.f33702a);
        sb2.append(", sdpMLineIndex=");
        sb2.append(this.f33703b);
        sb2.append(", sdpMid=");
        return a.n(sb2, this.f33704c, ')');
    }

    public IceCandidateJSON(String str, int i10, String str2) {
        this.f33702a = str;
        this.f33703b = i10;
        this.f33704c = str2;
    }
}
