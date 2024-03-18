package com.segment.analytics.kotlin.core.platform.plugins;

import ah.AbstractC1998i;
import android.gov.nist.core.a;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SegmentSettings {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public String f27811a;

    /* renamed from: b  reason: collision with root package name */
    public String f27812b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return SegmentSettings$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentSettings)) {
            return false;
        }
        SegmentSettings segmentSettings = (SegmentSettings) obj;
        return AbstractC3557B.K(this.f27811a, segmentSettings.f27811a) && AbstractC3557B.K(this.f27812b, segmentSettings.f27812b);
    }

    public final int hashCode() {
        int hashCode = this.f27811a.hashCode() * 31;
        String str = this.f27812b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SegmentSettings(apiKey=");
        sb2.append(this.f27811a);
        sb2.append(", apiHost=");
        return a.n(sb2, this.f27812b, ')');
    }
}
