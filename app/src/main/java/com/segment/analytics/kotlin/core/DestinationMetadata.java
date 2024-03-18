package com.segment.analytics.kotlin.core;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DestinationMetadata {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public List f27763a;

    /* renamed from: b  reason: collision with root package name */
    public List f27764b;

    /* renamed from: c  reason: collision with root package name */
    public List f27765c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/DestinationMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return DestinationMetadata$$serializer.INSTANCE;
        }
    }

    public DestinationMetadata() {
        v vVar = v.f37483Y;
        this.f27763a = vVar;
        this.f27764b = vVar;
        this.f27765c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestinationMetadata)) {
            return false;
        }
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj;
        return AbstractC3557B.K(this.f27763a, destinationMetadata.f27763a) && AbstractC3557B.K(this.f27764b, destinationMetadata.f27764b) && AbstractC3557B.K(this.f27765c, destinationMetadata.f27765c);
    }

    public final int hashCode() {
        List list = this.f27763a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f27764b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f27765c;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        return "DestinationMetadata(bundled=" + this.f27763a + ", unbundled=" + this.f27764b + ", bundledIds=" + this.f27765c + ')';
    }
}
