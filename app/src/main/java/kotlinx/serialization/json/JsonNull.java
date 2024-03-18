package kotlinx.serialization.json;

import ah.AbstractC1998i;
import eh.C2924x;
import eh.C2925y;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i(with = C2925y.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/d;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class JsonNull extends d {
    public static final JsonNull INSTANCE = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ AbstractC3957g f37660Y = R4.b.C1(EnumC3958h.f36152Y, C2924x.f29476Y);

    @Override // kotlinx.serialization.json.d
    public final String r() {
        return "null";
    }

    @Override // kotlinx.serialization.json.d
    public final boolean s() {
        return false;
    }

    public final KSerializer serializer() {
        return (KSerializer) f37660Y.getValue();
    }
}
