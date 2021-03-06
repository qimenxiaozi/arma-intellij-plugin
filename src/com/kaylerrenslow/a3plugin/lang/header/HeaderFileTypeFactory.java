package com.kaylerrenslow.a3plugin.lang.header;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * FileTypeFactory extension point for Header language
 *
 * @author Kayler
 * @since 10/31/2015
 */
public class HeaderFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(HeaderFileType.INSTANCE, HeaderStatic.FILE_EXTENSION);
	}
}
