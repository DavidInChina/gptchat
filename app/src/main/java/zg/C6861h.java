package zg;

import Df.AbstractC0407f;
import fg.Q;
import id.AbstractC3557B;
import kg.C4294f;
import kotlin.jvm.internal.C;
import xg.K;

/* renamed from: zg.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6861h extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f52034Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6861h(int i10, Object obj) {
        super(1, obj);
        this.f52034Y = i10;
    }

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        switch (this.f52034Y) {
            case 0:
                return "simpleType";
            case 1:
                return "getValueClassPropertyType";
            default:
                return "<init>";
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        switch (this.f52034Y) {
            case 0:
                return C.f37623a.b(kotlin.jvm.internal.m.class);
            case 1:
                return C.f37623a.b(C6862i.class);
            default:
                return C.f37623a.b(C6859f.class);
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        switch (this.f52034Y) {
            case 0:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 1:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            default:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f52034Y) {
            case 0:
                Q q10 = (Q) obj;
                AbstractC3557B.c0("p0", q10);
                return ((K) this.receiver).d(q10, true);
            case 1:
                C4294f c4294f = (C4294f) obj;
                AbstractC3557B.c0("p0", c4294f);
                return ((C6862i) this.receiver).y0(c4294f);
            default:
                Cg.i iVar = (Cg.i) obj;
                AbstractC3557B.c0("p0", iVar);
                return new C6859f((C6862i) this.receiver, iVar);
        }
    }
}
