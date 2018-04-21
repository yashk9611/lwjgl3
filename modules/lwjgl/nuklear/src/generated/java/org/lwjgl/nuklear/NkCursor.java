/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_cursor {
 *     {@link NkImage struct nk_image} img;
 *     {@link NkVec2 struct nk_vec2} size;
 *     {@link NkVec2 struct nk_vec2} offset;
 * }</pre></code>
 */
@NativeType("struct nk_cursor")
public class NkCursor extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMG,
        SIZE,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(NkImage.SIZEOF, NkImage.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMG = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    NkCursor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkCursor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkCursor(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkImage} view of the {@code img} field. */
    @NativeType("struct nk_image")
    public NkImage img() { return nimg(address()); }
    /** Returns a {@link NkVec2} view of the {@code size} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 size() { return nsize(address()); }
    /** Returns a {@link NkVec2} view of the {@code offset} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 offset() { return noffset(address()); }

    /** Copies the specified {@link NkImage} to the {@code img} field. */
    public NkCursor img(@NativeType("struct nk_image") NkImage value) { nimg(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code size} field. */
    public NkCursor size(@NativeType("struct nk_vec2") NkVec2 value) { nsize(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code offset} field. */
    public NkCursor offset(@NativeType("struct nk_vec2") NkVec2 value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkCursor set(
        NkImage img,
        NkVec2 size,
        NkVec2 offset
    ) {
        img(img);
        size(size);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkCursor set(NkCursor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link NkCursor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkCursor malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link NkCursor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkCursor calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link NkCursor} instance allocated with {@link BufferUtils}. */
    public static NkCursor create() {
        return new NkCursor(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkCursor} instance for the specified memory address. */
    public static NkCursor create(long address) {
        return new NkCursor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkCursor createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link NkCursor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkCursor.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkCursor} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkCursor mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkCursor} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkCursor callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkCursor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkCursor mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkCursor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkCursor callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #img}. */
    public static NkImage nimg(long struct) { return NkImage.create(struct + NkCursor.IMG); }
    /** Unsafe version of {@link #size}. */
    public static NkVec2 nsize(long struct) { return NkVec2.create(struct + NkCursor.SIZE); }
    /** Unsafe version of {@link #offset}. */
    public static NkVec2 noffset(long struct) { return NkVec2.create(struct + NkCursor.OFFSET); }

    /** Unsafe version of {@link #img(NkImage) img}. */
    public static void nimg(long struct, NkImage value) { memCopy(value.address(), struct + NkCursor.IMG, NkImage.SIZEOF); }
    /** Unsafe version of {@link #size(NkVec2) size}. */
    public static void nsize(long struct, NkVec2 value) { memCopy(value.address(), struct + NkCursor.SIZE, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #offset(NkVec2) offset}. */
    public static void noffset(long struct, NkVec2 value) { memCopy(value.address(), struct + NkCursor.OFFSET, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkCursor} structs. */
    public static class Buffer extends StructBuffer<NkCursor, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkCursor.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkCursor#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkCursor newInstance(long address) {
            return new NkCursor(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link NkImage} view of the {@code img} field. */
        @NativeType("struct nk_image")
        public NkImage img() { return NkCursor.nimg(address()); }
        /** Returns a {@link NkVec2} view of the {@code size} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 size() { return NkCursor.nsize(address()); }
        /** Returns a {@link NkVec2} view of the {@code offset} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 offset() { return NkCursor.noffset(address()); }

        /** Copies the specified {@link NkImage} to the {@code img} field. */
        public NkCursor.Buffer img(@NativeType("struct nk_image") NkImage value) { NkCursor.nimg(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code size} field. */
        public NkCursor.Buffer size(@NativeType("struct nk_vec2") NkVec2 value) { NkCursor.nsize(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code offset} field. */
        public NkCursor.Buffer offset(@NativeType("struct nk_vec2") NkVec2 value) { NkCursor.noffset(address(), value); return this; }

    }

}