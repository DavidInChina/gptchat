package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends AbstractC2497d0 implements N0 {
    protected S extensions = S.f27491d;

    private void eagerlyMergeMessageSetExtension(AbstractC2543v abstractC2543v, C2491b0 c2491b0, J j6, int i10) {
        parseExtension(abstractC2543v, j6, c2491b0, (i10 << 3) | 2, i10);
    }

    private void mergeMessageSetExtensionFromBytes(AbstractC2534q abstractC2534q, J j6, C2491b0 c2491b0) {
        L0 l02;
        S s10 = this.extensions;
        M0 m02 = (M0) s10.f27492a.get(c2491b0.f27522d);
        if (m02 != null) {
            l02 = m02.toBuilder();
        } else {
            l02 = null;
        }
        if (l02 == null) {
            l02 = c2491b0.f27521c.newBuilderForType();
        }
        AbstractC2490b abstractC2490b = (AbstractC2490b) l02;
        abstractC2490b.getClass();
        try {
            AbstractC2543v U10 = abstractC2534q.U();
            ((X) abstractC2490b).e(U10, j6);
            U10.a(0);
            ensureExtensionsAreMutable().p(c2491b0.f27522d, c2491b0.b(((X) l02).b()));
        } catch (C2540t0 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading " + abstractC2490b.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e11);
        }
    }

    private <MessageType extends M0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC2543v abstractC2543v, J j6) {
        int i10 = 0;
        C2532p c2532p = null;
        C2491b0 c2491b0 = null;
        while (true) {
            int F10 = abstractC2543v.F();
            if (F10 == 0) {
                break;
            } else if (F10 == 16) {
                i10 = abstractC2543v.G();
                if (i10 != 0) {
                    c2491b0 = j6.a(i10, messagetype);
                }
            } else if (F10 == 26) {
                if (i10 != 0 && c2491b0 != null) {
                    eagerlyMergeMessageSetExtension(abstractC2543v, c2491b0, j6, i10);
                    c2532p = null;
                } else {
                    c2532p = abstractC2543v.n();
                }
            } else if (!abstractC2543v.I(F10)) {
                break;
            }
        }
        abstractC2543v.a(12);
        if (c2532p != null && i10 != 0) {
            if (c2491b0 != null) {
                mergeMessageSetExtensionFromBytes(c2532p, j6, c2491b0);
            } else {
                mergeLengthDelimitedField(i10, c2532p);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean parseExtension(AbstractC2543v abstractC2543v, J j6, C2491b0 c2491b0, int i10, int i11) {
        boolean z10;
        Object obj;
        L0 l02;
        M0 m02;
        int i12 = i10 & 7;
        boolean z11 = false;
        if (c2491b0 != null) {
            C2488a0 c2488a0 = c2491b0.f27522d;
            N1 n12 = c2488a0.f27516h0;
            S s10 = S.f27491d;
            if (i12 == n12.f27434Z) {
                z10 = false;
            } else if (c2488a0.f27517i0 && n12.a() && i12 == 2) {
                z10 = true;
            }
            if (!z11) {
                return parseUnknownField(i10, abstractC2543v);
            }
            ensureExtensionsAreMutable();
            if (z10) {
                int l10 = abstractC2543v.l(abstractC2543v.x());
                C2488a0 c2488a02 = c2491b0.f27522d;
                if (c2488a02.f27516h0 == N1.ENUM) {
                    while (abstractC2543v.e() > 0) {
                        AbstractC2515j0 a5 = c2488a02.f27514Y.a(abstractC2543v.p());
                        if (a5 == null) {
                            return true;
                        }
                        this.extensions.a(c2488a02, c2491b0.b(a5));
                    }
                } else {
                    while (abstractC2543v.e() > 0) {
                        N1 n13 = c2488a02.f27516h0;
                        S s11 = S.f27491d;
                        this.extensions.a(c2488a02, AbstractC2508h.T(abstractC2543v, n13, 1));
                    }
                }
                abstractC2543v.k(l10);
            } else {
                int ordinal = c2491b0.f27522d.f27516h0.f27433Y.ordinal();
                C2488a0 c2488a03 = c2491b0.f27522d;
                if (ordinal != 7) {
                    if (ordinal != 8) {
                        N1 n14 = c2488a03.f27516h0;
                        S s12 = S.f27491d;
                        obj = AbstractC2508h.T(abstractC2543v, n14, 1);
                    } else {
                        if (!c2488a03.f27517i0 && (m02 = (M0) this.extensions.f27492a.get(c2488a03)) != null) {
                            l02 = m02.toBuilder();
                        } else {
                            l02 = null;
                        }
                        if (l02 == null) {
                            l02 = c2491b0.f27521c.newBuilderForType();
                        }
                        if (c2488a03.f27516h0 == N1.GROUP) {
                            abstractC2543v.t(c2488a03.f27515Z, l02, j6);
                        } else {
                            abstractC2543v.w(l02, j6);
                        }
                        obj = ((X) l02).b();
                    }
                } else {
                    int p10 = abstractC2543v.p();
                    AbstractC2515j0 a10 = c2488a03.f27514Y.a(p10);
                    if (a10 == null) {
                        mergeVarintField(i11, p10);
                        return true;
                    }
                    obj = a10;
                }
                if (c2488a03.f27517i0) {
                    this.extensions.a(c2488a03, c2491b0.b(obj));
                } else {
                    this.extensions.p(c2488a03, c2491b0.b(obj));
                }
            }
            return true;
        }
        z10 = false;
        z11 = true;
        if (!z11) {
        }
    }

    private void verifyExtensionContainingType(C2491b0 c2491b0) {
        if (c2491b0.f27519a == getDefaultInstanceForType()) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public S ensureExtensionsAreMutable() {
        S s10 = this.extensions;
        if (s10.f27493b) {
            this.extensions = s10.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.j();
    }

    public int extensionsSerializedSize() {
        return this.extensions.h();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.f();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(G g10) {
        C2491b0 c2491b0 = g10.getClass();
        verifyExtensionContainingType(c2491b0);
        S s10 = this.extensions;
        Type type = (Type) s10.f27492a.get(c2491b0.f27522d);
        if (type == null) {
            return (Type) c2491b0.f27520b;
        }
        C2488a0 c2488a0 = c2491b0.f27522d;
        if (c2488a0.f27517i0) {
            if (c2488a0.f27516h0.f27433Y != O1.f27465n0) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            for (Object obj : (List) type) {
                r12.add(c2491b0.a(obj));
            }
            return r12;
        }
        return (Type) c2491b0.a(type);
    }

    public final <Type> int getExtensionCount(G g10) {
        C2491b0 c2491b0 = g10.getClass();
        verifyExtensionContainingType(c2491b0);
        S s10 = this.extensions;
        C2488a0 c2488a0 = c2491b0.f27522d;
        s10.getClass();
        if (c2488a0.f27517i0) {
            Object obj = s10.f27492a.get(c2488a0);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final <Type> boolean hasExtension(G g10) {
        C2491b0 c2491b0 = g10.getClass();
        verifyExtensionContainingType(c2491b0);
        S s10 = this.extensions;
        C2488a0 c2488a0 = c2491b0.f27522d;
        s10.getClass();
        if (!c2488a0.f27517i0) {
            if (s10.f27492a.get(c2488a0) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        S s10 = this.extensions;
        if (s10.f27493b) {
            this.extensions = s10.clone();
        }
        this.extensions.n(messagetype.extensions);
    }

    public Z newExtensionWriter() {
        return new Z(this);
    }

    public Z newMessageSetExtensionWriter() {
        return new Z(this);
    }

    public <MessageType extends M0> boolean parseUnknownField(MessageType messagetype, AbstractC2543v abstractC2543v, J j6, int i10) {
        int i11 = i10 >>> 3;
        return parseExtension(abstractC2543v, j6, j6.a(i11, messagetype), i10, i11);
    }

    public <MessageType extends M0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC2543v abstractC2543v, J j6, int i10) {
        if (i10 == 11) {
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC2543v, j6);
            return true;
        } else if ((i10 & 7) == 2) {
            return parseUnknownField(messagetype, abstractC2543v, j6, i10);
        } else {
            return abstractC2543v.I(i10);
        }
    }

    public final <Type> Type getExtension(G g10, int i10) {
        C2491b0 c2491b0 = g10.getClass();
        verifyExtensionContainingType(c2491b0);
        S s10 = this.extensions;
        C2488a0 c2488a0 = c2491b0.f27522d;
        s10.getClass();
        if (c2488a0.f27517i0) {
            Object obj = s10.f27492a.get(c2488a0);
            if (obj != null) {
                return (Type) c2491b0.a(((List) obj).get(i10));
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
